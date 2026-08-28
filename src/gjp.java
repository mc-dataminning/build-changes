import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gjp {
   private final GameProfile a;
   private final Supplier<hja> b;
   private dim c = dim.e;
   private int d;
   @Nullable
   private ww e;
   private boolean f = true;
   @Nullable
   private xn g;
   private xs h;
   private int i;

   public gjp(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hja>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hja> a(GameProfile $$0) {
      fof $$1 = fof.Q();
      hjb $$2 = $$1.an();
      CompletableFuture<Optional<hja>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hja $$5 = hir.a($$0);
      return () -> {
         hja $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xn b() {
      return this.g;
   }

   public xs c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xn $$0) {
      this.g = $$0;
      this.h = $$0.a(cqv.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xs c(boolean $$0) {
      return $$0 ? xs.c : xs.b;
   }

   public dim e() {
      return this.c;
   }

   protected void a(dim $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hja g() {
      return this.b.get();
   }

   @Nullable
   public few h() {
      return fof.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable ww $$0) {
      this.e = $$0;
   }

   @Nullable
   public ww i() {
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
