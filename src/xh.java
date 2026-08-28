import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xh(xi l, xi m) {
   public static final Codec<xh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xi.a.fieldOf("chat").forGetter(xh::a), xi.a.fieldOf("narration").forGetter(xh::b)).apply($$0, xh::new)
   );
   public static final zj<ww, xh> b = zj.a(xi.b, xh::a, xi.b, xh::b, xh::new);
   public static final zj<ww, jq<xh>> c = zh.a(ma.aH, b);
   public static final xi d = xi.a("chat.type.text");
   public static final alk<xh> e = a("chat");
   public static final alk<xh> f = a("say_command");
   public static final alk<xh> g = a("msg_command_incoming");
   public static final alk<xh> h = a("msg_command_outgoing");
   public static final alk<xh> i = a("team_msg_command_incoming");
   public static final alk<xh> j = a("team_msg_command_outgoing");
   public static final alk<xh> k = a("emote_command");

   private static alk<xh> a(String $$0) {
      return alk.a(ma.aH, all.b($$0));
   }

   public static void a(rb<xh> $$0) {
      $$0.a(e, new xh(d, xi.a("chat.type.text.narrate")));
      $$0.a(f, new xh(xi.a("chat.type.announcement"), xi.a("chat.type.text.narrate")));
      $$0.a(g, new xh(xi.b("commands.message.display.incoming"), xi.a("chat.type.text.narrate")));
      $$0.a(h, new xh(xi.c("commands.message.display.outgoing"), xi.a("chat.type.text.narrate")));
      $$0.a(i, new xh(xi.d("chat.type.team.text"), xi.a("chat.type.text.narrate")));
      $$0.a(j, new xh(xi.d("chat.type.team.sent"), xi.a("chat.type.text.narrate")));
      $$0.a(k, new xh(xi.a("chat.type.emote"), xi.a("chat.type.emote")));
   }

   public static xh.a a(alk<xh> $$0, bui $$1) {
      return a($$0, $$1.dY().H_(), $$1.S_());
   }

   public static xh.a a(alk<xh> $$0, ew $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xh.a a(alk<xh> $$0, ke $$1, xl $$2) {
      kd<xh> $$3 = $$1.e(ma.aH);
      return new xh.a($$3.b($$0), $$2);
   }

   public xi a() {
      return this.l;
   }

   public xi b() {
      return this.m;
   }

   public static record a(jq<xh> b, xl c, Optional<xl> d) {
      public static final zj<ww, xh.a> a = zj.a(xh.c, xh.a::a, xn.d, xh.a::b, xn.e, xh.a::c, xh.a::new);

      a(jq<xh> $$0, xl $$1) {
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

      public jq<xh> a() {
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
