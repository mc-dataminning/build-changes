import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvx {
   private final GameProfile a;
   private final Supplier<gnn> b;
   private czr c = czr.e;
   private int d;
   @Nullable
   private ws e;
   @Nullable
   private xj f;
   private xo g;

   public fvx(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gnn>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gnn> a(GameProfile $$0) {
      fcu $$1 = fcu.Q();
      gno $$2 = $$1.an();
      CompletableFuture<gnn> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gnn $$5 = gng.a($$0);
      return () -> {
         gnn $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xj b() {
      return this.f;
   }

   public xo c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xj $$0) {
      this.f = $$0;
      this.g = $$0.a(cko.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xo b(boolean $$0) {
      return $$0 ? xo.c : xo.b;
   }

   public czr e() {
      return this.c;
   }

   protected void a(czr $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gnn g() {
      return this.b.get();
   }

   @Nullable
   public eue h() {
      return fcu.Q().r.L().e(this.a().getName());
   }

   public void a(@Nullable ws $$0) {
      this.e = $$0;
   }

   @Nullable
   public ws i() {
      return this.e;
   }
}
