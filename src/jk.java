import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jk implements jq {
   public static final jq.a<jk> a = new jq.a<jk>() {
      public jk a(jr<jk> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new jk($$0, fk.a(jy.f.p(), $$1, false).a());
      }

      public jk a(jr<jk> $$0, tl $$1) {
         return new jk($$0, $$1.a(cua.q));
      }
   };
   private final jr<jk> b;
   private final dgb c;

   public static Codec<jk> a(jr<jk> $$0) {
      return dgb.b.xmap($$1 -> new jk($$0, $$1), $$0x -> $$0x.c);
   }

   public jk(jr<jk> $$0, dgb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tl $$0) {
      $$0.a(cua.q, this.c);
   }

   @Override
   public String a() {
      return jy.k.b(this.b()) + " " + fk.a(this.c);
   }

   @Override
   public jr<jk> b() {
      return this.b;
   }

   public dgb c() {
      return this.c;
   }
}
