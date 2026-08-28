import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyo {
   private final GameProfile a;
   private final Supplier<gqi> b;
   private dca c = dca.e;
   private int d;
   @Nullable
   private wu e;
   @Nullable
   private xl f;
   private xq g;

   public fyo(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gqi>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gqi> a(GameProfile $$0) {
      ffn $$1 = ffn.Q();
      gqj $$2 = $$1.am();
      CompletableFuture<gqi> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gqi $$5 = gqa.a($$0);
      return () -> {
         gqi $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xl b() {
      return this.f;
   }

   public xq c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xl $$0) {
      this.f = $$0;
      this.g = $$0.a(cmk.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xq b(boolean $$0) {
      return $$0 ? xq.c : xq.b;
   }

   public dca e() {
      return this.c;
   }

   protected void a(dca $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gqi g() {
      return this.b.get();
   }

   @Nullable
   public ewy h() {
      return ffn.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable wu $$0) {
      this.e = $$0;
   }

   @Nullable
   public wu i() {
      return this.e;
   }
}
