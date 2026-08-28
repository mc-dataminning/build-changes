import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fxv {
   private static final Vector3f a = new Vector3f();
   protected final Function<alb, ghe> v;

   public fxv(Function<alb, ghe> $$0) {
      this.v = $$0;
   }

   public final ghe a(alb $$0) {
      return this.v.apply($$0);
   }

   public final void a(fcu $$0, fcy $$1, int $$2, int $$3, int $$4) {
      this.a().a($$0, $$1, $$2, $$3, $$4);
   }

   public final void a(fcu $$0, fcy $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }

   public abstract gab a();

   public Optional<gab> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.a()) : this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   protected void a(btd $$0, fiq $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(fiq $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      fis.a(this, $$0, $$5, $$6, a);
   }

   protected void a(btd $$0, fiq $$1, float $$2, float $$3) {
      $$0.a($$3x -> fis.a(this, $$1, (long)((float)$$3x.a($$2) * $$3), 1.0F, a));
   }

   protected void a(fiq $$0) {
      fis.a(this, $$0, 0L, 1.0F, a);
   }

   public static class a extends fxv {
      private final gab a;

      public a(gab $$0, Function<alb, ghe> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public gab a() {
         return this.a;
      }
   }
}
