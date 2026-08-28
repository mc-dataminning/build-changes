import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyf {
   private final GameProfile a;
   private final Supplier<gpy> b;
   private dbu c = dbu.e;
   private int d;
   @Nullable
   private xo e;
   @Nullable
   private yf f;
   private yk g;

   public fyf(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gpy>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gpy> a(GameProfile $$0) {
      ffe $$1 = ffe.Q();
      gpz $$2 = $$1.am();
      CompletableFuture<gpy> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gpy $$5 = gpq.a($$0);
      return () -> {
         gpy $$3x = $$3.getNow($$5);
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
      this.g = $$0.a(cmz.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yk b(boolean $$0) {
      return $$0 ? yk.c : yk.b;
   }

   public dbu e() {
      return this.c;
   }

   protected void a(dbu $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gpy g() {
      return this.b.get();
   }

   @Nullable
   public ewp h() {
      return ffe.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable xo $$0) {
      this.e = $$0;
   }

   @Nullable
   public xo i() {
      return this.e;
   }
}
