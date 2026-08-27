import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxc {
   private final GameProfile a;
   private final Supplier<gov> b;
   private dau c = dau.e;
   private int d;
   @Nullable
   private wx e;
   @Nullable
   private xo f;
   private xt g;

   public fxc(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gov>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gov> a(GameProfile $$0) {
      fdz $$1 = fdz.Q();
      gow $$2 = $$1.an();
      CompletableFuture<gov> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gov $$5 = gon.a($$0);
      return () -> {
         gov $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xo b() {
      return this.f;
   }

   public xt c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xo $$0) {
      this.f = $$0;
      this.g = $$0.a(clz.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xt b(boolean $$0) {
      return $$0 ? xt.c : xt.b;
   }

   public dau e() {
      return this.c;
   }

   protected void a(dau $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gov g() {
      return this.b.get();
   }

   @Nullable
   public evj h() {
      return fdz.Q().r.L().e(this.a().getName());
   }

   public void a(@Nullable wx $$0) {
      this.e = $$0;
   }

   @Nullable
   public wx i() {
      return this.e;
   }
}
