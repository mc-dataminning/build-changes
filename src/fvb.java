import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvb {
   private final GameProfile a;
   private final Supplier<gmr> b;
   private czd c = czd.e;
   private int d;
   @Nullable
   private wi e;
   @Nullable
   private wz f;
   private xe g;

   public fvb(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gmr>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gmr> a(GameProfile $$0) {
      fby $$1 = fby.Q();
      gms $$2 = $$1.an();
      CompletableFuture<gmr> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gmr $$5 = gmk.a($$0);
      return () -> {
         gmr $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public wz b() {
      return this.f;
   }

   public xe c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(wz $$0) {
      this.f = $$0;
      this.g = $$0.a(ckd.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xe b(boolean $$0) {
      return $$0 ? xe.c : xe.b;
   }

   public czd e() {
      return this.c;
   }

   protected void a(czd $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gmr g() {
      return this.b.get();
   }

   @Nullable
   public eti h() {
      return fby.Q().r.L().e(this.a().getName());
   }

   public void a(@Nullable wi $$0) {
      this.e = $$0;
   }

   @Nullable
   public wi i() {
      return this.e;
   }
}
