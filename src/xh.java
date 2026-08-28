import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xh(xi j, xi k) {
   public static final Codec<xh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xi.a.fieldOf("chat").forGetter(xh::a), xi.a.fieldOf("narration").forGetter(xh::b)).apply($$0, xh::new)
   );
   public static final xi b = xi.a("chat.type.text");
   public static final ala<xh> c = a("chat");
   public static final ala<xh> d = a("say_command");
   public static final ala<xh> e = a("msg_command_incoming");
   public static final ala<xh> f = a("msg_command_outgoing");
   public static final ala<xh> g = a("team_msg_command_incoming");
   public static final ala<xh> h = a("team_msg_command_outgoing");
   public static final ala<xh> i = a("emote_command");

   private static ala<xh> a(String $$0) {
      return ala.a(lq.aA, new alb($$0));
   }

   public static void a(rc<xh> $$0) {
      $$0.a(c, new xh(b, xi.a("chat.type.text.narrate")));
      $$0.a(d, new xh(xi.a("chat.type.announcement"), xi.a("chat.type.text.narrate")));
      $$0.a(e, new xh(xi.b("commands.message.display.incoming"), xi.a("chat.type.text.narrate")));
      $$0.a(f, new xh(xi.c("commands.message.display.outgoing"), xi.a("chat.type.text.narrate")));
      $$0.a(g, new xh(xi.d("chat.type.team.text"), xi.a("chat.type.text.narrate")));
      $$0.a(h, new xh(xi.d("chat.type.team.sent"), xi.a("chat.type.text.narrate")));
      $$0.a(i, new xh(xi.a("chat.type.emote"), xi.a("chat.type.emote")));
   }

   public static xh.a a(ala<xh> $$0, bsp $$1) {
      return a($$0, $$1.dP().H_(), $$1.O_());
   }

   public static xh.a a(ala<xh> $$0, ep $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xh.a a(ala<xh> $$0, jw $$1, xl $$2) {
      jv<xh> $$3 = $$1.d(lq.aA);
      return new xh.a($$3.g($$0), $$2);
   }

   public xi a() {
      return this.j;
   }

   public xi b() {
      return this.k;
   }

   public static record a(ji<xh> b, xl c, Optional<xl> d) {
      public static final zj<ww, xh.a> a = zj.a(zh.b(lq.aA), xh.a::a, xn.d, xh.a::b, xn.e, xh.a::c, xh.a::new);

      a(ji<xh> $$0, xl $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xl a(xl $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xl b(xl $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xh.a c(xl $$0) {
         return new xh.a(this.b, this.c, Optional.of($$0));
      }

      public ji<xh> a() {
         return this.b;
      }

      public xl b() {
         return this.c;
      }

      public Optional<xl> c() {
         return this.d;
      }
   }
}
