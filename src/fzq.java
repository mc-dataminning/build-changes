import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzq {
   private final GameProfile a;
   private final Supplier<grl> b;
   private dct c = dct.e;
   private int d;
   @Nullable
   private wz e;
   @Nullable
   private xq f;
   private xv g;

   public fzq(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<grl>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<grl> a(GameProfile $$0) {
      fgo $$1 = fgo.Q();
      grm $$2 = $$1.am();
      CompletableFuture<grl> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      grl $$5 = grd.a($$0);
      return () -> {
         grl $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xq b() {
      return this.f;
   }

   public xv c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xq $$0) {
      this.f = $$0;
      this.g = $$0.a(cna.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xv b(boolean $$0) {
      return $$0 ? xv.c : xv.b;
   }

   public dct e() {
      return this.c;
   }

   protected void a(dct $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public grl g() {
      return this.b.get();
   }

   @Nullable
   public eyb h() {
      return fgo.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable wz $$0) {
      this.e = $$0;
   }

   @Nullable
   public wz i() {
      return this.e;
   }
}
