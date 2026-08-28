import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class sr {
   public static final Codec<sr> b = mg.aC.q().dispatch(sr::a, $$0 -> $$0);
   private final tk<jf<tl>> a;

   public static MapCodec<? extends sr> a(js<MapCodec<? extends sr>> $$0) {
      a($$0, "block_based", sc.a);
      return a($$0, "function", sg.a);
   }

   private static MapCodec<? extends sr> a(js<MapCodec<? extends sr>> $$0, String $$1, MapCodec<? extends sr> $$2) {
      return js.a($$0, alh.a(mh.az, ali.b($$1)), $$2);
   }

   protected sr(tk<jf<tl>> $$0) {
      this.a = $$0;
   }

   public abstract void a(sp var1);

   public abstract MapCodec<? extends sr> a();

   public jf<tl> d() {
      return this.a.a();
   }

   public ali e() {
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

   public dtw m() {
      return this.a.f();
   }

   protected tk<jf<tl>> n() {
      return this.a;
   }

   protected abstract xo b();

   public xa c() {
      return this.o().b(this.p());
   }

   protected xo o() {
      return this.a("test_instance.description.type", this.b());
   }

   protected xa p() {
      return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
   }

   protected xo a(String $$0, String $$1) {
      return this.a($$0, xa.b($$1));
   }

   protected xo a(String $$0, xo $$1) {
      return xa.a($$0, $$1.a(o.j)).b(xa.b("\n"));
   }
}
