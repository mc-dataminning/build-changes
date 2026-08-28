import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyg {
   private final GameProfile a;
   private final Supplier<gpz> b;
   private dbv c = dbv.e;
   private int d;
   @Nullable
   private xp e;
   @Nullable
   private yg f;
   private yl g;

   public fyg(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gpz>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gpz> a(GameProfile $$0) {
      fff $$1 = fff.Q();
      gqa $$2 = $$1.am();
      CompletableFuture<gpz> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gpz $$5 = gpr.a($$0);
      return () -> {
         gpz $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public yg b() {
      return this.f;
   }

   public yl c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(yg $$0) {
      this.f = $$0;
      this.g = $$0.a(cna.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yl b(boolean $$0) {
      return $$0 ? yl.c : yl.b;
   }

   public dbv e() {
      return this.c;
   }

   protected void a(dbv $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gpz g() {
      return this.b.get();
   }

   @Nullable
   public ewq h() {
      return fff.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable xp $$0) {
      this.e = $$0;
   }

   @Nullable
   public xp i() {
      return this.e;
   }
}
