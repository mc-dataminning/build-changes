import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class sr {
   public static final Codec<sr> b = mf.aC.q().dispatch(sr::a, $$0 -> $$0);
   private final tk<je<tl>> a;

   public static MapCodec<? extends sr> a(jr<MapCodec<? extends sr>> $$0) {
      a($$0, "block_based", sc.a);
      return a($$0, "function", sg.a);
   }

   private static MapCodec<? extends sr> a(jr<MapCodec<? extends sr>> $$0, String $$1, MapCodec<? extends sr> $$2) {
      return jr.a($$0, alf.a(mg.az, alg.b($$1)), $$2);
   }

   protected sr(tk<je<tl>> $$0) {
      this.a = $$0;
   }

   public abstract void a(sp var1);

   public abstract MapCodec<? extends sr> a();

   public je<tl> d() {
      return this.a.a();
   }

   public alg e() {
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

   public dst m() {
      return this.a.f();
   }

   protected tk<je<tl>> n() {
      return this.a;
   }

   protected abstract xm b();

   public wy c() {
      return this.o().b(this.p());
   }

   protected xm o() {
      return this.a("test_instance.description.type", this.b());
   }

   protected wy p() {
      return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
   }

   protected xm a(String $$0, String $$1) {
      return this.a($$0, wy.b($$1));
   }

   protected xm a(String $$0, xm $$1) {
      return wy.a($$0, $$1.a(n.j)).b(wy.b("\n"));
   }
}
