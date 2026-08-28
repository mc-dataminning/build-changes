import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wz(xa l, xa m) {
   public static final Codec<wz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xa.a.fieldOf("chat").forGetter(wz::a), xa.a.fieldOf("narration").forGetter(wz::b)).apply($$0, wz::new)
   );
   public static final zb<wo, wz> b = zb.a(xa.b, wz::a, xa.b, wz::b, wz::new);
   public static final zb<wo, jn<wz>> c = yz.a(lv.aH, b);
   public static final xa d = xa.a("chat.type.text");
   public static final alb<wz> e = a("chat");
   public static final alb<wz> f = a("say_command");
   public static final alb<wz> g = a("msg_command_incoming");
   public static final alb<wz> h = a("msg_command_outgoing");
   public static final alb<wz> i = a("team_msg_command_incoming");
   public static final alb<wz> j = a("team_msg_command_outgoing");
   public static final alb<wz> k = a("emote_command");

   private static alb<wz> a(String $$0) {
      return alb.a(lv.aH, alc.b($$0));
   }

   public static void a(qt<wz> $$0) {
      $$0.a(e, new wz(d, xa.a("chat.type.text.narrate")));
      $$0.a(f, new wz(xa.a("chat.type.announcement"), xa.a("chat.type.text.narrate")));
      $$0.a(g, new wz(xa.b("commands.message.display.incoming"), xa.a("chat.type.text.narrate")));
      $$0.a(h, new wz(xa.c("commands.message.display.outgoing"), xa.a("chat.type.text.narrate")));
      $$0.a(i, new wz(xa.d("chat.type.team.text"), xa.a("chat.type.text.narrate")));
      $$0.a(j, new wz(xa.d("chat.type.team.sent"), xa.a("chat.type.text.narrate")));
      $$0.a(k, new wz(xa.a("chat.type.emote"), xa.a("chat.type.emote")));
   }

   public static wz.a a(alb<wz> $$0, bto $$1) {
      return a($$0, $$1.dS().F_(), $$1.Q_());
   }

   public static wz.a a(alb<wz> $$0, et $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wz.a a(alb<wz> $$0, kb $$1, xd $$2) {
      ka<wz> $$3 = $$1.d(lv.aH);
      return new wz.a($$3.g($$0), $$2);
   }

   public xa a() {
      return this.l;
   }

   public xa b() {
      return this.m;
   }

   public static record a(jn<wz> b, xd c, Optional<xd> d) {
      public static final zb<wo, wz.a> a = zb.a(wz.c, wz.a::a, xf.d, wz.a::b, xf.e, wz.a::c, wz.a::new);

      a(jn<wz> $$0, xd $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xd a(xd $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xd b(xd $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wz.a c(xd $$0) {
         return new wz.a(this.b, this.c, Optional.of($$0));
      }

      public jn<wz> a() {
         return this.b;
      }

      public xd b() {
         return this.c;
      }

      public Optional<xd> c() {
         return this.d;
      }
   }
}
