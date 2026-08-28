import java.util.Arrays;

public class gdn extends gdl {
   private static final xc a = xc.c("options.sounds.title");

   private static fri<?>[] a(frj $$0) {
      return new fri[]{$$0.Z(), $$0.aa()};
   }

   public gdn(gaf $$0, frj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(aws.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fri<?>[] H() {
      return Arrays.stream(aws.values()).filter($$0 -> $$0 != aws.a).map($$0 -> this.c.b($$0)).toArray(fri[]::new);
   }
}
