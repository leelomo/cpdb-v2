package hk.ed.cpdb.bean;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Component;

import hk.ed.cpdb.entitytemp.Temp;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "createArticleSingleBean")
public class CreateArticleSingleBean implements Serializable {

	private List<Temp> articleList;
	
    private UploadedFile file;

    private StreamedContent downloadFile;
    
    private String selection;
    
    private FilterBean filterBean = new FilterBean("createArticleSingleBean",new Temp());
    
    public FilterBean getFilterBean() {
		return filterBean;
	}



	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}



	@PostConstruct
	public void init(){
		List<Temp> articleList = new ArrayList<Temp>();
		
		articleList.add(new Temp("V000001242", "30001252", "Released", "Active", "Active"));
		articleList.add(new Temp("V000006313", "300012412", "Released", "Discontinue", "Active"));
		articleList.add(new Temp("V000009125", "400011512", "Released", "Freeze", "Prohibited"));
		articleList.add(new Temp("V000015231", "N/A", "In process", "Active", "Active"));
		articleList.add(new Temp("V000027915", "300091252", "Released", "Active", "Active"));
		
		setArticleList(articleList);

	}

  

	public CreateArticleSingleBean() {
        InputStream stream = this.getClass().getResourceAsStream("/PFSamplePDF.pdf");
        downloadFile = new DefaultStreamedContent(stream, "application/xls", "PFSample.xls");
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
//        MessageUtil.addInfoMessage("upload.successful", file.getFileName() + " is uploaded.");
    }

    public StreamedContent getDownloadFile() {
        return downloadFile;
    }

	public String getSelection(){
		return selection;
	}

	public void setSelection(String selection){
		this.selection = selection;
	}

	public void setDownloadFile(StreamedContent downloadFile){
		this.downloadFile = downloadFile;
	}
	
	public List<Temp> getArticleList(){
		return articleList;
	}

	public void setArticleList(List<Temp> articleList){
		this.articleList = articleList;
	}
    
    
}