import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jr implements jt {
   public static final jt.a<jr> a = new jt.a<jr>() {
      public jr a(ju<jr> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         fy.a $$2 = fy.a(kb.h.p(), $$1);
         cmh $$3 = new fx($$2.a(), $$2.b()).a(1, false);
         return new jr($$0, $$3);
      }

      public jr a(ju<jr> $$0, ue $$1) {
         return new jr($$0, $$1.r());
      }
   };
   private final ju<jr> b;
   private final cmh c;

   public static Codec<jr> a(ju<jr> $$0) {
      return cmh.a.xmap($$1 -> new jr($$0, $$1), $$0x -> $$0x.c);
   }

   public jr(ju<jr> $$0, cmh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return kb.j.b(this.b()) + " " + new fx(this.c.e(), this.c.v()).b();
   }

   @Override
   public ju<jr> b() {
      return this.b;
   }

   public cmh c() {
      return this.c;
   }
}
