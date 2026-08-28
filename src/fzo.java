import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzo {
   private final GameProfile a;
   private final Supplier<grj> b;
   private dct c = dct.e;
   private int d;
   @Nullable
   private wz e;
   @Nullable
   private xq f;
   private xv g;

   public fzo(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<grj>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<grj> a(GameProfile $$0) {
      fgm $$1 = fgm.Q();
      grk $$2 = $$1.am();
      CompletableFuture<grj> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      grj $$5 = grb.a($$0);
      return () -> {
         grj $$3x = $$3.getNow($$5);
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

   public grj g() {
      return this.b.get();
   }

   @Nullable
   public exz h() {
      return fgm.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable wz $$0) {
      this.e = $$0;
   }

   @Nullable
   public wz i() {
      return this.e;
   }
}
