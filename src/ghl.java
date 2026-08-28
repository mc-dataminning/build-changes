import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class ghl {
   private static final Vector3f a = new Vector3f();
   protected final gjt v;
   protected final Function<alg, grc> w;
   private final List<gjt> b;

   public ghl(gjt $$0, Function<alg, grc> $$1) {
      this.v = $$0;
      this.w = $$1;
      this.b = $$0.e().toList();
   }

   public final grc a(alg $$0) {
      return this.w.apply($$0);
   }

   public final void a(fkd $$0, fkh $$1, int $$2, int $$3, int $$4) {
      this.e().a($$0, $$1, $$2, $$3, $$4);
   }

   public final void a(fkd $$0, fkh $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }

   public final gjt e() {
      return this.v;
   }

   public Optional<gjt> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.e()) : this.e().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   public final List<gjt> f() {
      return this.b;
   }

   public final void g() {
      for (gjt $$0 : this.b) {
         $$0.c();
      }
   }

   protected void a(bvz $$0, fqh $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(fqh $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      fqj.a(this, $$0, $$5, $$6, a);
   }

   protected void a(bvz $$0, fqh $$1, float $$2, float $$3) {
      $$0.a($$3x -> fqj.a(this, $$1, (long)((float)$$3x.a($$2) * $$3), 1.0F, a));
   }

   protected void a(fqh $$0) {
      fqj.a(this, $$0, 0L, 1.0F, a);
   }

   public static class a extends ghl {
      public a(gjt $$0, Function<alg, grc> $$1) {
         super($$0, $$1);
      }
   }
}
