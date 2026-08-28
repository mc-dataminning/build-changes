import java.util.List;

public record wd(List<String> a, vw<?> b, String c) {
   public wd(vw<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public wd(String $$0, vw<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public wd(String $$0, String $$1, vw<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
