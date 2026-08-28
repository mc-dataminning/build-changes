import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyb {
   private final GameProfile a;
   private final Supplier<gpu> b;
   private dbq c = dbq.e;
   private int d;
   @Nullable
   private xl e;
   @Nullable
   private yc f;
   private yh g;

   public fyb(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gpu>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gpu> a(GameProfile $$0) {
      ffa $$1 = ffa.Q();
      gpv $$2 = $$1.am();
      CompletableFuture<gpu> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gpu $$5 = gpm.a($$0);
      return () -> {
         gpu $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public yc b() {
      return this.f;
   }

   public yh c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(yc $$0) {
      this.f = $$0;
      this.g = $$0.a(cmv.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yh b(boolean $$0) {
      return $$0 ? yh.c : yh.b;
   }

   public dbq e() {
      return this.c;
   }

   protected void a(dbq $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gpu g() {
      return this.b.get();
   }

   @Nullable
   public ewl h() {
      return ffa.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable xl $$0) {
      this.e = $$0;
   }

   @Nullable
   public xl i() {
      return this.e;
   }
}
