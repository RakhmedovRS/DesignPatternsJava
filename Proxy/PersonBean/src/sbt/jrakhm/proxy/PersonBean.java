package sbt.jrakhm.proxy;

/**
 * @author rassoll
 * @created 20.09.2017
 * @$Author$
 * @$Revision$
 */
public interface PersonBean
{
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);

}
