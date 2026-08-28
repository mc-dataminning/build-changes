import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class sp {
   public static final Codec<sp> b = md.aE.q().dispatch(sp::a, $$0 -> $$0);
   private final ti<js<tj>> a;

   public static MapCodec<? extends sp> a(kf<MapCodec<? extends sp>> $$0) {
      a($$0, "block_based", sb.a);
      return a($$0, "function", sf.a);
   }

   private static MapCodec<? extends sp> a(kf<MapCodec<? extends sp>> $$0, String $$1, MapCodec<? extends sp> $$2) {
      return kf.a($$0, alc.a(me.aL, ald.b($$1)), $$2);
   }

   protected sp(ti<js<tj>> $$0) {
      this.a = $$0;
   }

   public abstract void a(sn var1);

   public abstract MapCodec<? extends sp> a();

   public js<tj> d() {
      return this.a.a();
   }

   public ald e() {
      return this.a.b();
   }

   public int f() {
      return this.a.c();
   }

   public int g() {
      return this.a.d();
   }

   public boolean h() {
      return this.a.e();
   }

   public boolean i() {
      return this.a.g();
   }

   public int j() {
      return this.a.h();
   }

   public int k() {
      return this.a.i();
   }

   public boolean l() {
      return this.a.j();
   }

   public drm m() {
      return this.a.f();
   }

   protected ti<js<tj>> n() {
      return this.a;
   }

   protected abstract xj b();

   public wv c() {
      return this.o().b(this.p());
   }

   protected xj o() {
      return this.a("test_instance.description.type", this.b());
   }

   protected wv p() {
      return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
   }

   protected xj a(String $$0, String $$1) {
      return this.a($$0, wv.b($$1));
   }

   protected xj a(String $$0, xj $$1) {
      return wv.a($$0, $$1.a(n.j)).b(wv.b("\n"));
   }
}
