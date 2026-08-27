import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fus {
   private final GameProfile a;
   private final Supplier<gmi> b;
   private cyu c = cyu.e;
   private int d;
   @Nullable
   private wg e;
   @Nullable
   private wx f;
   private xc g;

   public fus(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gmi>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gmi> a(GameProfile $$0) {
      fbp $$1 = fbp.Q();
      gmj $$2 = $$1.an();
      CompletableFuture<gmi> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gmi $$5 = gmb.a($$0);
      return () -> {
         gmi $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public wx b() {
      return this.f;
   }

   public xc c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(wx $$0) {
      this.f = $$0;
      this.g = $$0.a(cjw.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xc b(boolean $$0) {
      return $$0 ? xc.c : xc.b;
   }

   public cyu e() {
      return this.c;
   }

   protected void a(cyu $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gmi g() {
      return this.b.get();
   }

   @Nullable
   public esz h() {
      return fbp.Q().r.L().e(this.a().getName());
   }

   public void a(@Nullable wg $$0) {
      this.e = $$0;
   }

   @Nullable
   public wg i() {
      return this.e;
   }
}
