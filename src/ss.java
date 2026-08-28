import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class ss {
   public static final Codec<ss> b = mh.aC.q().dispatch(ss::a, $$0 -> $$0);
   private final tl<jg<tm>> a;

   public static MapCodec<? extends ss> a(jt<MapCodec<? extends ss>> $$0) {
      a($$0, "block_based", sd.a);
      return a($$0, "function", sh.a);
   }

   private static MapCodec<? extends ss> a(jt<MapCodec<? extends ss>> $$0, String $$1, MapCodec<? extends ss> $$2) {
      return jt.a($$0, alq.a(mi.az, alr.b($$1)), $$2);
   }

   protected ss(tl<jg<tm>> $$0) {
      this.a = $$0;
   }

   public abstract void a(sq var1);

   public abstract MapCodec<? extends ss> a();

   public jg<tm> d() {
      return this.a.a();
   }

   public alr e() {
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

   public dui m() {
      return this.a.f();
   }

   protected tl<jg<tm>> n() {
      return this.a;
   }

   protected abstract xu b();

   public xg c() {
      return this.o().b(this.p());
   }

   protected xu o() {
      return this.a("test_instance.description.type", this.b());
   }

   protected xg p() {
      return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
   }

   protected xu a(String $$0, String $$1) {
      return this.a($$0, xg.b($$1));
   }

   protected xu a(String $$0, xu $$1) {
      return xg.a($$0, $$1.a(o.j)).b(xg.b("\n"));
   }
}
