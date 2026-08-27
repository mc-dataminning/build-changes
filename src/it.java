import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class it implements iv {
   public static final iv.a<it> a = new iv.a<it>() {
      public it a(iw<it> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         fy.a $$2 = fy.a(jd.i.p(), $$1);
         cjh $$3 = new fx($$2.a(), $$2.b()).a(1, false);
         return new it($$0, $$3);
      }

      public it a(iw<it> $$0, sq $$1) {
         return new it($$0, $$1.q());
      }
   };
   private final iw<it> b;
   private final cjh c;

   public static Codec<it> a(iw<it> $$0) {
      return cjh.a.xmap($$1 -> new it($$0, $$1), $$0x -> $$0x.c);
   }

   public it(iw<it> $$0, cjh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return jd.k.b(this.b()) + " " + new fx(this.c.e(), this.c.v()).b();
   }

   @Override
   public iw<it> b() {
      return this.b;
   }

   public cjh c() {
      return this.c;
   }
}
