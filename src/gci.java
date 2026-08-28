import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gci {
   private final GameProfile a;
   private final Supplier<gyt> b;
   private des c = des.e;
   private int d;
   @Nullable
   private xh e;
   @Nullable
   private xy f;
   private yd g;
   private int h;

   public gci(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gyt>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gyt> a(GameProfile $$0) {
      fja $$1 = fja.Q();
      gyu $$2 = $$1.an();
      CompletableFuture<gyt> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gyt $$5 = gyk.a($$0);
      return () -> {
         gyt $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xy b() {
      return this.f;
   }

   public yd c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xy $$0) {
      this.f = $$0;
      this.g = $$0.a(cok.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yd b(boolean $$0) {
      return $$0 ? yd.c : yd.b;
   }

   public des e() {
      return this.c;
   }

   protected void a(des $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gyt g() {
      return this.b.get();
   }

   @Nullable
   public fah h() {
      return fja.Q().s.O().e(this.a().getName());
   }

   public void a(@Nullable xh $$0) {
      this.e = $$0;
   }

   @Nullable
   public xh i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
