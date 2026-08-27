import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record wp(String b, List<wp.a> c, xp d) {
   public static final Codec<wp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wp::a),
               wp.a.d.listOf().fieldOf("parameters").forGetter(wp::b),
               xp.b.b.optionalFieldOf("style", xp.a).forGetter(wp::c)
            )
            .apply($$0, wp::new)
   );

   public static wp a(String $$0) {
      return new wp($$0, List.of(wp.a.a, wp.a.c), xp.a);
   }

   public static wp b(String $$0) {
      xp $$1 = xp.a.a(n.h).b(true);
      return new wp($$0, List.of(wp.a.a, wp.a.c), $$1);
   }

   public static wp c(String $$0) {
      xp $$1 = xp.a.a(n.h).b(true);
      return new wp($$0, List.of(wp.a.b, wp.a.c), $$1);
   }

   public static wp d(String $$0) {
      return new wp($$0, List.of(wp.a.b, wp.a.a, wp.a.c), xp.a);
   }

   public ws a(ws $$0, wo.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return ws.a(this.b, $$2).c(this.d);
   }

   private ws[] b(ws $$0, wo.a $$1) {
      ws[] $$2 = new ws[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wp.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<wp.a> b() {
      return this.c;
   }

   public xp c() {
      return this.d;
   }

   public static enum a implements ayq {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(wr.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<wp.a> d = ayq.a(wp.a::values);
      private final String e;
      private final wp.a.a f;

      private a(String $$0, wp.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public ws a(ws $$0, wo.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         ws select(ws var1, wo.a var2);
      }
   }
}
