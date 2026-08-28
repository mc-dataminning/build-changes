import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class sq {
   public static final Codec<sq> b = mf.aC.q().dispatch(sq::a, $$0 -> $$0);
   private final tj<je<tk>> a;

   public static MapCodec<? extends sq> a(jr<MapCodec<? extends sq>> $$0) {
      a($$0, "block_based", sc.a);
      return a($$0, "function", sg.a);
   }

   private static MapCodec<? extends sq> a(jr<MapCodec<? extends sq>> $$0, String $$1, MapCodec<? extends sq> $$2) {
      return jr.a($$0, ald.a(mg.az, ale.b($$1)), $$2);
   }

   protected sq(tj<je<tk>> $$0) {
      this.a = $$0;
   }

   public abstract void a(so var1);

   public abstract MapCodec<? extends sq> a();

   public je<tk> d() {
      return this.a.a();
   }

   public ale e() {
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

   public dsm m() {
      return this.a.f();
   }

   protected tj<je<tk>> n() {
      return this.a;
   }

   protected abstract xk b();

   public ww c() {
      return this.o().b(this.p());
   }

   protected xk o() {
      return this.a("test_instance.description.type", this.b());
   }

   protected ww p() {
      return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
   }

   protected xk a(String $$0, String $$1) {
      return this.a($$0, ww.b($$1));
   }

   protected xk a(String $$0, xk $$1) {
      return ww.a($$0, $$1.a(n.j)).b(ww.b("\n"));
   }
}
