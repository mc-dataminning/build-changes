import org.apache.commons.lang3.StringEscapeUtils;

public class z extends RuntimeException {
   public z(String $$0) {
      super(StringEscapeUtils.escapeJava($$0));
   }

   public z(String $$0, Throwable $$1) {
      super(StringEscapeUtils.escapeJava($$0), $$1);
   }
}
