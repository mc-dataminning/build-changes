import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xd(xe l, xe m) {
   public static final Codec<xd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xe.a.fieldOf("chat").forGetter(xd::a), xe.a.fieldOf("narration").forGetter(xd::b)).apply($$0, xd::new)
   );
   public static final zf<ws, xd> b = zf.a(xe.b, xd::a, xe.b, xd::b, xd::new);
   public static final zf<ws, jp<xd>> c = zd.a(ly.aH, b);
   public static final xe d = xe.a("chat.type.text");
   public static final alg<xd> e = a("chat");
   public static final alg<xd> f = a("say_command");
   public static final alg<xd> g = a("msg_command_incoming");
   public static final alg<xd> h = a("msg_command_outgoing");
   public static final alg<xd> i = a("team_msg_command_incoming");
   public static final alg<xd> j = a("team_msg_command_outgoing");
   public static final alg<xd> k = a("emote_command");

   private static alg<xd> a(String $$0) {
      return alg.a(ly.aH, alh.b($$0));
   }

   public static void a(qx<xd> $$0) {
      $$0.a(e, new xd(d, xe.a("chat.type.text.narrate")));
      $$0.a(f, new xd(xe.a("chat.type.announcement"), xe.a("chat.type.text.narrate")));
      $$0.a(g, new xd(xe.b("commands.message.display.incoming"), xe.a("chat.type.text.narrate")));
      $$0.a(h, new xd(xe.c("commands.message.display.outgoing"), xe.a("chat.type.text.narrate")));
      $$0.a(i, new xd(xe.d("chat.type.team.text"), xe.a("chat.type.text.narrate")));
      $$0.a(j, new xd(xe.d("chat.type.team.sent"), xe.a("chat.type.text.narrate")));
      $$0.a(k, new xd(xe.a("chat.type.emote"), xe.a("chat.type.emote")));
   }

   public static xd.a a(alg<xd> $$0, btz $$1) {
      return a($$0, $$1.dX().H_(), $$1.S_());
   }

   public static xd.a a(alg<xd> $$0, ev $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xd.a a(alg<xd> $$0, kd $$1, xh $$2) {
      kc<xd> $$3 = $$1.e(ly.aH);
      return new xd.a($$3.b($$0), $$2);
   }

   public xe a() {
      return this.l;
   }

   public xe b() {
      return this.m;
   }

   public static record a(jp<xd> b, xh c, Optional<xh> d) {
      public static final zf<ws, xd.a> a = zf.a(xd.c, xd.a::a, xj.d, xd.a::b, xj.e, xd.a::c, xd.a::new);

      a(jp<xd> $$0, xh $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xh a(xh $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xh b(xh $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xd.a c(xh $$0) {
         return new xd.a(this.b, this.c, Optional.of($$0));
      }

      public jp<xd> a() {
         return this.b;
      }

      public xh b() {
         return this.c;
      }

      public Optional<xh> c() {
         return this.d;
      }
   }
}
