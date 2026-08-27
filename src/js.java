import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class js implements ju {
   public static final ju.a<js> a = new ju.a<js>() {
      public js a(jv<js> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         ga.a $$2 = ga.a(kc.i.p(), $$1);
         clo $$3 = new fz($$2.a(), $$2.b()).a(1, false);
         return new js($$0, $$3);
      }

      public js a(jv<js> $$0, ty $$1) {
         return new js($$0, $$1.r());
      }
   };
   private final jv<js> b;
   private final clo c;

   public static Codec<js> a(jv<js> $$0) {
      return clo.a.xmap($$1 -> new js($$0, $$1), $$0x -> $$0x.c);
   }

   public js(jv<js> $$0, clo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return kc.k.b(this.b()) + " " + new fz(this.c.e(), this.c.v()).b();
   }

   @Override
   public jv<js> b() {
      return this.b;
   }

   public clo c() {
      return this.c;
   }
}
