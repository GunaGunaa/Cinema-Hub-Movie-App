// Generated by view binder compiler. Do not edit!
package com.karurmallow.demotestingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.karurmallow.demotestingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MaActivityViewMovieBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ConstraintLayout clNetworkBanner;

  @NonNull
  public final ConstraintLayout clReview;

  @NonNull
  public final ConstraintLayout clShowMovie;

  @NonNull
  public final Guideline glVerticalEnd;

  @NonNull
  public final Guideline glVerticalStart;

  @NonNull
  public final ImageView ivBackArrow;

  @NonNull
  public final ImageView ivMoviePoster;

  @NonNull
  public final ScrollView svShowMovie;

  @NonNull
  public final Toolbar tbMovieShow;

  @NonNull
  public final TextView tvMovieData;

  @NonNull
  public final TextView tvMovieDescriptions;

  @NonNull
  public final TextView tvMovieLanguage;

  @NonNull
  public final TextView tvMovieName;

  @NonNull
  public final TextView tvNetworkState;

  @NonNull
  public final TextView tvRating;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvTotalReviews;

  @NonNull
  public final View viMoviePoster;

  @NonNull
  public final View viVertical;

  private MaActivityViewMovieBinding(@NonNull ScrollView rootView,
      @NonNull ConstraintLayout clNetworkBanner, @NonNull ConstraintLayout clReview,
      @NonNull ConstraintLayout clShowMovie, @NonNull Guideline glVerticalEnd,
      @NonNull Guideline glVerticalStart, @NonNull ImageView ivBackArrow,
      @NonNull ImageView ivMoviePoster, @NonNull ScrollView svShowMovie,
      @NonNull Toolbar tbMovieShow, @NonNull TextView tvMovieData,
      @NonNull TextView tvMovieDescriptions, @NonNull TextView tvMovieLanguage,
      @NonNull TextView tvMovieName, @NonNull TextView tvNetworkState, @NonNull TextView tvRating,
      @NonNull TextView tvTitle, @NonNull TextView tvTotalReviews, @NonNull View viMoviePoster,
      @NonNull View viVertical) {
    this.rootView = rootView;
    this.clNetworkBanner = clNetworkBanner;
    this.clReview = clReview;
    this.clShowMovie = clShowMovie;
    this.glVerticalEnd = glVerticalEnd;
    this.glVerticalStart = glVerticalStart;
    this.ivBackArrow = ivBackArrow;
    this.ivMoviePoster = ivMoviePoster;
    this.svShowMovie = svShowMovie;
    this.tbMovieShow = tbMovieShow;
    this.tvMovieData = tvMovieData;
    this.tvMovieDescriptions = tvMovieDescriptions;
    this.tvMovieLanguage = tvMovieLanguage;
    this.tvMovieName = tvMovieName;
    this.tvNetworkState = tvNetworkState;
    this.tvRating = tvRating;
    this.tvTitle = tvTitle;
    this.tvTotalReviews = tvTotalReviews;
    this.viMoviePoster = viMoviePoster;
    this.viVertical = viVertical;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static MaActivityViewMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MaActivityViewMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ma_activity_view_movie, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MaActivityViewMovieBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cl_network_banner;
      ConstraintLayout clNetworkBanner = ViewBindings.findChildViewById(rootView, id);
      if (clNetworkBanner == null) {
        break missingId;
      }

      id = R.id.cl_review;
      ConstraintLayout clReview = ViewBindings.findChildViewById(rootView, id);
      if (clReview == null) {
        break missingId;
      }

      id = R.id.cl_show_movie;
      ConstraintLayout clShowMovie = ViewBindings.findChildViewById(rootView, id);
      if (clShowMovie == null) {
        break missingId;
      }

      id = R.id.gl_vertical_end;
      Guideline glVerticalEnd = ViewBindings.findChildViewById(rootView, id);
      if (glVerticalEnd == null) {
        break missingId;
      }

      id = R.id.gl_vertical_start;
      Guideline glVerticalStart = ViewBindings.findChildViewById(rootView, id);
      if (glVerticalStart == null) {
        break missingId;
      }

      id = R.id.iv_back_arrow;
      ImageView ivBackArrow = ViewBindings.findChildViewById(rootView, id);
      if (ivBackArrow == null) {
        break missingId;
      }

      id = R.id.iv_movie_poster;
      ImageView ivMoviePoster = ViewBindings.findChildViewById(rootView, id);
      if (ivMoviePoster == null) {
        break missingId;
      }

      ScrollView svShowMovie = (ScrollView) rootView;

      id = R.id.tb_movie_show;
      Toolbar tbMovieShow = ViewBindings.findChildViewById(rootView, id);
      if (tbMovieShow == null) {
        break missingId;
      }

      id = R.id.tv_movie_data;
      TextView tvMovieData = ViewBindings.findChildViewById(rootView, id);
      if (tvMovieData == null) {
        break missingId;
      }

      id = R.id.tv_movie_descriptions;
      TextView tvMovieDescriptions = ViewBindings.findChildViewById(rootView, id);
      if (tvMovieDescriptions == null) {
        break missingId;
      }

      id = R.id.tv_movie_language;
      TextView tvMovieLanguage = ViewBindings.findChildViewById(rootView, id);
      if (tvMovieLanguage == null) {
        break missingId;
      }

      id = R.id.tv_movie_name;
      TextView tvMovieName = ViewBindings.findChildViewById(rootView, id);
      if (tvMovieName == null) {
        break missingId;
      }

      id = R.id.tv_network_state;
      TextView tvNetworkState = ViewBindings.findChildViewById(rootView, id);
      if (tvNetworkState == null) {
        break missingId;
      }

      id = R.id.tv_rating;
      TextView tvRating = ViewBindings.findChildViewById(rootView, id);
      if (tvRating == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tv_total_reviews;
      TextView tvTotalReviews = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalReviews == null) {
        break missingId;
      }

      id = R.id.vi_movie_poster;
      View viMoviePoster = ViewBindings.findChildViewById(rootView, id);
      if (viMoviePoster == null) {
        break missingId;
      }

      id = R.id.vi_vertical;
      View viVertical = ViewBindings.findChildViewById(rootView, id);
      if (viVertical == null) {
        break missingId;
      }

      return new MaActivityViewMovieBinding((ScrollView) rootView, clNetworkBanner, clReview,
          clShowMovie, glVerticalEnd, glVerticalStart, ivBackArrow, ivMoviePoster, svShowMovie,
          tbMovieShow, tvMovieData, tvMovieDescriptions, tvMovieLanguage, tvMovieName,
          tvNetworkState, tvRating, tvTitle, tvTotalReviews, viMoviePoster, viVertical);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
