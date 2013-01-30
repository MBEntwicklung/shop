/**
 * 
 */
package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Comment;

/**
 *
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
