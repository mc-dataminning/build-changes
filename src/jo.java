import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jo implements ju {
   public static final ju.a<jo> a = new ju.a<jo>() {
      public jo a(jv<jo> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new jo($$0, fk.a(kc.f.p(), $$1, false).a());
      }

      public jo a(jv<jo> $$0, ty $$1) {
         return new jo($$0, $$1.a(cvf.q));
      }
   };
   private final jv<jo> b;
   private final dhn c;

   public static Codec<jo> a(jv<jo> $$0) {
      return dhn.b.xmap($$1 -> new jo($$0, $$1), $$0x -> $$0x.c);
   }

   public jo(jv<jo> $$0, dhn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ty $$0) {
      $$0.a(cvf.q, this.c);
   }

   @Override
   public String a() {
      return kc.k.b(this.b()) + " " + fk.a(this.c);
   }

   @Override
   public jv<jo> b() {
      return this.b;
   }

   public dhn c() {
      return this.c;
   }
}
