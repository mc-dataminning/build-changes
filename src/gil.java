import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gil {
   private final GameProfile a;
   private final Supplier<hhu> b;
   private dhm c = dhm.e;
   private int d;
   @Nullable
   private wv e;
   private boolean f = true;
   @Nullable
   private xm g;
   private xr h;
   private int i;

   public gil(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hhu>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hhu> a(GameProfile $$0) {
      fnd $$1 = fnd.Q();
      hhv $$2 = $$1.an();
      CompletableFuture<Optional<hhu>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hhu $$5 = hhl.a($$0);
      return () -> {
         hhu $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xm b() {
      return this.g;
   }

   public xr c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xm $$0) {
      this.g = $$0;
      this.h = $$0.a(cql.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xr c(boolean $$0) {
      return $$0 ? xr.c : xr.b;
   }

   public dhm e() {
      return this.c;
   }

   protected void a(dhm $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hhu g() {
      return this.b.get();
   }

   @Nullable
   public fdu h() {
      return fnd.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable wv $$0) {
      this.e = $$0;
   }

   @Nullable
   public wv i() {
      return this.e;
   }

   public void b(boolean $$0) {
      this.f = $$0;
   }

   public boolean j() {
      return this.f;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public int k() {
      return this.i;
   }
}
