import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xc(xd l, xd m) {
   public static final Codec<xc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xd.a.fieldOf("chat").forGetter(xc::a), xd.a.fieldOf("narration").forGetter(xc::b)).apply($$0, xc::new)
   );
   public static final ze<wp, xc> b = ze.a(xd.b, xc::a, xd.b, xc::b, xc::new);
   public static final ze<wp, jg<xc>> c = zc.a(mi.aI, b);
   public static final xd d = xd.a("chat.type.text");
   public static final alq<xc> e = a("chat");
   public static final alq<xc> f = a("say_command");
   public static final alq<xc> g = a("msg_command_incoming");
   public static final alq<xc> h = a("msg_command_outgoing");
   public static final alq<xc> i = a("team_msg_command_incoming");
   public static final alq<xc> j = a("team_msg_command_outgoing");
   public static final alq<xc> k = a("emote_command");

   private static alq<xc> a(String $$0) {
      return alq.a(mi.aI, alr.b($$0));
   }

   public static void a(qi<xc> $$0) {
      $$0.a(e, new xc(d, xd.a("chat.type.text.narrate")));
      $$0.a(f, new xc(xd.a("chat.type.announcement"), xd.a("chat.type.text.narrate")));
      $$0.a(g, new xc(xd.b("commands.message.display.incoming"), xd.a("chat.type.text.narrate")));
      $$0.a(h, new xc(xd.c("commands.message.display.outgoing"), xd.a("chat.type.text.narrate")));
      $$0.a(i, new xc(xd.d("chat.type.team.text"), xd.a("chat.type.text.narrate")));
      $$0.a(j, new xc(xd.d("chat.type.team.sent"), xd.a("chat.type.text.narrate")));
      $$0.a(k, new xc(xd.a("chat.type.emote"), xd.a("chat.type.emote")));
   }

   public static xc.a a(alq<xc> $$0, bxe $$1) {
      return a($$0, $$1.dV().J_(), $$1.m_());
   }

   public static xc.a a(alq<xc> $$0, ek $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static xc.a a(alq<xc> $$0, ju $$1, xg $$2) {
      jt<xc> $$3 = $$1.f(mi.aI);
      return new xc.a($$3.b($$0), $$2);
   }

   public xd a() {
      return this.l;
   }

   public xd b() {
      return this.m;
   }

   public static record a(jg<xc> b, xg c, Optional<xg> d) {
      public static final ze<wp, xc.a> a = ze.a(xc.c, xc.a::a, xi.d, xc.a::b, xi.e, xc.a::c, xc.a::new);

      a(jg<xc> $$0, xg $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xg a(xg $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xg b(xg $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xc.a c(xg $$0) {
         return new xc.a(this.b, this.c, Optional.of($$0));
      }

      public jg<xc> a() {
         return this.b;
      }

      public xg b() {
         return this.c;
      }

      public Optional<xg> c() {
         return this.d;
      }
   }
}
