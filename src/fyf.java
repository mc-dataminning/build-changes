import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fyf {
   private static final Vector3f a = new Vector3f();
   protected final Function<alc, ghq> v;

   public fyf(Function<alc, ghq> $$0) {
      this.v = $$0;
   }

   public final ghq a(alc $$0) {
      return this.v.apply($$0);
   }

   public final void a(fde $$0, fdi $$1, int $$2, int $$3, int $$4) {
      this.a().a($$0, $$1, $$2, $$3, $$4);
   }

   public final void a(fde $$0, fdi $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }

   public abstract gal a();

   public Optional<gal> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.a()) : this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   protected void a(bti $$0, fja $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(fja $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      fjc.a(this, $$0, $$5, $$6, a);
   }

   protected void a(bti $$0, fja $$1, float $$2, float $$3) {
      $$0.a($$3x -> fjc.a(this, $$1, (long)((float)$$3x.a($$2) * $$3), 1.0F, a));
   }

   protected void a(fja $$0) {
      fjc.a(this, $$0, 0L, 1.0F, a);
   }

   public static class a extends fyf {
      private final gal a;

      public a(gal $$0, Function<alc, ghq> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public gal a() {
         return this.a;
      }
   }
}
