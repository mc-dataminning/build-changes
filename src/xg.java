import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xg(xh l, xh m) {
   public static final Codec<xg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xh.a.fieldOf("chat").forGetter(xg::a), xh.a.fieldOf("narration").forGetter(xg::b)).apply($$0, xg::new)
   );
   public static final zi<wv, xg> b = zi.a(xh.b, xg::a, xh.b, xg::b, xg::new);
   public static final zi<wv, jq<xg>> c = zg.a(mb.aJ, b);
   public static final xh d = xh.a("chat.type.text");
   public static final alo<xg> e = a("chat");
   public static final alo<xg> f = a("say_command");
   public static final alo<xg> g = a("msg_command_incoming");
   public static final alo<xg> h = a("msg_command_outgoing");
   public static final alo<xg> i = a("team_msg_command_incoming");
   public static final alo<xg> j = a("team_msg_command_outgoing");
   public static final alo<xg> k = a("emote_command");

   private static alo<xg> a(String $$0) {
      return alo.a(mb.aJ, alp.b($$0));
   }

   public static void a(ra<xg> $$0) {
      $$0.a(e, new xg(d, xh.a("chat.type.text.narrate")));
      $$0.a(f, new xg(xh.a("chat.type.announcement"), xh.a("chat.type.text.narrate")));
      $$0.a(g, new xg(xh.b("commands.message.display.incoming"), xh.a("chat.type.text.narrate")));
      $$0.a(h, new xg(xh.c("commands.message.display.outgoing"), xh.a("chat.type.text.narrate")));
      $$0.a(i, new xg(xh.d("chat.type.team.text"), xh.a("chat.type.text.narrate")));
      $$0.a(j, new xg(xh.d("chat.type.team.sent"), xh.a("chat.type.text.narrate")));
      $$0.a(k, new xg(xh.a("chat.type.emote"), xh.a("chat.type.emote")));
   }

   public static xg.a a(alo<xg> $$0, bvb $$1) {
      return a($$0, $$1.dW().K_(), $$1.p_());
   }

   public static xg.a a(alo<xg> $$0, ew $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static xg.a a(alo<xg> $$0, ke $$1, xk $$2) {
      kd<xg> $$3 = $$1.e(mb.aJ);
      return new xg.a($$3.b($$0), $$2);
   }

   public xh a() {
      return this.l;
   }

   public xh b() {
      return this.m;
   }

   public static record a(jq<xg> b, xk c, Optional<xk> d) {
      public static final zi<wv, xg.a> a = zi.a(xg.c, xg.a::a, xm.d, xg.a::b, xm.e, xg.a::c, xg.a::new);

      a(jq<xg> $$0, xk $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xk a(xk $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xk b(xk $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xg.a c(xk $$0) {
         return new xg.a(this.b, this.c, Optional.of($$0));
      }

      public jq<xg> a() {
         return this.b;
      }

      public xk b() {
         return this.c;
      }

      public Optional<xk> c() {
         return this.d;
      }
   }
}
