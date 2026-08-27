import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ju implements ka {
   public static final ka.a<ju> a = new ka.a<ju>() {
      public ju a(kb<ju> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new ju($$0, fm.a(ki.e.p(), $$1, false).a());
      }
   };
   private final kb<ju> b;
   private final dnb c;

   public static Codec<ju> a(kb<ju> $$0) {
      return dnb.b.xmap($$1 -> new ju($$0, $$1), $$0x -> $$0x.c);
   }

   public static xs<? super vf, ju> b(kb<ju> $$0) {
      return xq.a(dac.q).a($$1 -> new ju($$0, $$1), $$0x -> $$0x.c);
   }

   public ju(kb<ju> $$0, dnb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(in.a $$0) {
      return ki.j.b(this.a()) + " " + fm.a(this.c);
   }

   @Override
   public kb<ju> a() {
      return this.b;
   }

   public dnb b() {
      return this.c;
   }
}
