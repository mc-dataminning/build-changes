import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class gcv {
   private static final Vector3f a = new Vector3f();
   protected final gfc v;
   protected final Function<aku, gmh> w;
   private final List<gfc> b;

   public gcv(gfc $$0, Function<aku, gmh> $$1) {
      this.v = $$0;
      this.w = $$1;
      this.b = $$0.e().toList();
   }

   public final gmh a(aku $$0) {
      return this.w.apply($$0);
   }

   public final void a(ffu $$0, ffy $$1, int $$2, int $$3, int $$4) {
      this.e().a($$0, $$1, $$2, $$3, $$4);
   }

   public final void a(ffu $$0, ffy $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }

   public final gfc e() {
      return this.v;
   }

   public Optional<gfc> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.e()) : this.e().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   public final List<gfc> f() {
      return this.b;
   }

   public final void g() {
      for (gfc $$0 : this.b) {
         $$0.c();
      }
   }

   protected void a(buc $$0, flx $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(flx $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      flz.a(this, $$0, $$5, $$6, a);
   }

   protected void a(buc $$0, flx $$1, float $$2, float $$3) {
      $$0.a($$3x -> flz.a(this, $$1, (long)((float)$$3x.a($$2) * $$3), 1.0F, a));
   }

   protected void a(flx $$0) {
      flz.a(this, $$0, 0L, 1.0F, a);
   }

   public static class a extends gcv {
      public a(gfc $$0, Function<aku, gmh> $$1) {
         super($$0, $$1);
      }
   }
}
