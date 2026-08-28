import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gct {
   private final GameProfile a;
   private final Supplier<gze> b;
   private dey c = dey.e;
   private int d;
   @Nullable
   private xi e;
   @Nullable
   private xz f;
   private ye g;
   private int h;

   public gct(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gze>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gze> a(GameProfile $$0) {
      fji $$1 = fji.Q();
      gzf $$2 = $$1.an();
      CompletableFuture<gze> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gze $$5 = gyv.a($$0);
      return () -> {
         gze $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xz b() {
      return this.f;
   }

   public ye c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xz $$0) {
      this.f = $$0;
      this.g = $$0.a(coq.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ye b(boolean $$0) {
      return $$0 ? ye.c : ye.b;
   }

   public dey e() {
      return this.c;
   }

   protected void a(dey $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gze g() {
      return this.b.get();
   }

   @Nullable
   public fan h() {
      return fji.Q().s.O().e(this.a().getName());
   }

   public void a(@Nullable xi $$0) {
      this.e = $$0;
   }

   @Nullable
   public xi i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
