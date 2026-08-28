import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fyj {
   private static final Vector3f a = new Vector3f();
   protected final gaq v;
   protected final Function<ale, ghv> w;
   private final List<gaq> b;

   public fyj(gaq $$0, Function<ale, ghv> $$1) {
      this.v = $$0;
      this.w = $$1;
      this.b = $$0.e().toList();
   }

   public final ghv a(ale $$0) {
      return this.w.apply($$0);
   }

   public final void a(fdi $$0, fdm $$1, int $$2, int $$3, int $$4) {
      this.e().a($$0, $$1, $$2, $$3, $$4);
   }

   public final void a(fdi $$0, fdm $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }

   public final gaq e() {
      return this.v;
   }

   public Optional<gaq> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.e()) : this.e().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   public final List<gaq> f() {
      return this.b;
   }

   public final void g() {
      for (gaq $$0 : this.b) {
         $$0.c();
      }
   }

   protected void a(btl $$0, fje $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(fje $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      fjg.a(this, $$0, $$5, $$6, a);
   }

   protected void a(btl $$0, fje $$1, float $$2, float $$3) {
      $$0.a($$3x -> fjg.a(this, $$1, (long)((float)$$3x.a($$2) * $$3), 1.0F, a));
   }

   protected void a(fje $$0) {
      fjg.a(this, $$0, 0L, 1.0F, a);
   }

   public static class a extends fyj {
      public a(gaq $$0, Function<ale, ghv> $$1) {
         super($$0, $$1);
      }
   }
}
