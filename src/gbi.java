import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gbi {
   private final GameProfile a;
   private final Supplier<gxl> b;
   private ddp c = ddp.e;
   private int d;
   @Nullable
   private xd e;
   @Nullable
   private xu f;
   private xz g;
   private int h;

   public gbi(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gxl>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gxl> a(GameProfile $$0) {
      fib $$1 = fib.Q();
      gxm $$2 = $$1.am();
      CompletableFuture<gxl> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gxl $$5 = gxc.a($$0);
      return () -> {
         gxl $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xu b() {
      return this.f;
   }

   public xz c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xu $$0) {
      this.f = $$0;
      this.g = $$0.a(cns.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xz b(boolean $$0) {
      return $$0 ? xz.c : xz.b;
   }

   public ddp e() {
      return this.c;
   }

   protected void a(ddp $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gxl g() {
      return this.b.get();
   }

   @Nullable
   public ezd h() {
      return fib.Q().s.O().e(this.a().getName());
   }

   public void a(@Nullable xd $$0) {
      this.e = $$0;
   }

   @Nullable
   public xd i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
