import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwh {
   private final GameProfile a;
   private final Supplier<gny> b;
   private daa c = daa.e;
   private int d;
   @Nullable
   private wu e;
   @Nullable
   private xl f;
   private xq g;

   public fwh(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gny>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gny> a(GameProfile $$0) {
      fde $$1 = fde.Q();
      gnz $$2 = $$1.an();
      CompletableFuture<gny> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gny $$5 = gnq.a($$0);
      return () -> {
         gny $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xl b() {
      return this.f;
   }

   public xq c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xl $$0) {
      this.f = $$0;
      this.g = $$0.a(clk.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xq b(boolean $$0) {
      return $$0 ? xq.c : xq.b;
   }

   public daa e() {
      return this.c;
   }

   protected void a(daa $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gny g() {
      return this.b.get();
   }

   @Nullable
   public euo h() {
      return fde.Q().r.L().e(this.a().getName());
   }

   public void a(@Nullable wu $$0) {
      this.e = $$0;
   }

   @Nullable
   public wu i() {
      return this.e;
   }
}
