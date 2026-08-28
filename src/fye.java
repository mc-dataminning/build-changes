import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fye {
   private final GameProfile a;
   private final Supplier<gpx> b;
   private dbt c = dbt.e;
   private int d;
   @Nullable
   private xo e;
   @Nullable
   private yf f;
   private yk g;

   public fye(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gpx>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gpx> a(GameProfile $$0) {
      ffd $$1 = ffd.Q();
      gpy $$2 = $$1.am();
      CompletableFuture<gpx> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gpx $$5 = gpp.a($$0);
      return () -> {
         gpx $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public yf b() {
      return this.f;
   }

   public yk c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(yf $$0) {
      this.f = $$0;
      this.g = $$0.a(cmy.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yk b(boolean $$0) {
      return $$0 ? yk.c : yk.b;
   }

   public dbt e() {
      return this.c;
   }

   protected void a(dbt $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gpx g() {
      return this.b.get();
   }

   @Nullable
   public ewo h() {
      return ffd.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable xo $$0) {
      this.e = $$0;
   }

   @Nullable
   public xo i() {
      return this.e;
   }
}
