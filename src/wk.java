import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wk(wl l, wl m) {
   public static final Codec<wk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wl.a.fieldOf("chat").forGetter(wk::a), wl.a.fieldOf("narration").forGetter(wk::b)).apply($$0, wk::new)
   );
   public static final ym<vz, wk> b = ym.a(wl.b, wk::a, wl.b, wk::b, wk::new);
   public static final ym<vz, jr<wk>> c = yk.a(mc.aJ, b);
   public static final wl d = wl.a("chat.type.text");
   public static final akt<wk> e = a("chat");
   public static final akt<wk> f = a("say_command");
   public static final akt<wk> g = a("msg_command_incoming");
   public static final akt<wk> h = a("msg_command_outgoing");
   public static final akt<wk> i = a("team_msg_command_incoming");
   public static final akt<wk> j = a("team_msg_command_outgoing");
   public static final akt<wk> k = a("emote_command");

   private static akt<wk> a(String $$0) {
      return akt.a(mc.aJ, aku.b($$0));
   }

   public static void a(qe<wk> $$0) {
      $$0.a(e, new wk(d, wl.a("chat.type.text.narrate")));
      $$0.a(f, new wk(wl.a("chat.type.announcement"), wl.a("chat.type.text.narrate")));
      $$0.a(g, new wk(wl.b("commands.message.display.incoming"), wl.a("chat.type.text.narrate")));
      $$0.a(h, new wk(wl.c("commands.message.display.outgoing"), wl.a("chat.type.text.narrate")));
      $$0.a(i, new wk(wl.d("chat.type.team.text"), wl.a("chat.type.text.narrate")));
      $$0.a(j, new wk(wl.d("chat.type.team.sent"), wl.a("chat.type.text.narrate")));
      $$0.a(k, new wk(wl.a("chat.type.emote"), wl.a("chat.type.emote")));
   }

   public static wk.a a(akt<wk> $$0, buk $$1) {
      return a($$0, $$1.dW().K_(), $$1.p_());
   }

   public static wk.a a(akt<wk> $$0, ex $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static wk.a a(akt<wk> $$0, kf $$1, wo $$2) {
      ke<wk> $$3 = $$1.e(mc.aJ);
      return new wk.a($$3.b($$0), $$2);
   }

   public wl a() {
      return this.l;
   }

   public wl b() {
      return this.m;
   }

   public static record a(jr<wk> b, wo c, Optional<wo> d) {
      public static final ym<vz, wk.a> a = ym.a(wk.c, wk.a::a, wq.d, wk.a::b, wq.e, wk.a::c, wk.a::new);

      a(jr<wk> $$0, wo $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wo a(wo $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wo b(wo $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wk.a c(wo $$0) {
         return new wk.a(this.b, this.c, Optional.of($$0));
      }

      public jr<wk> a() {
         return this.b;
      }

      public wo b() {
         return this.c;
      }

      public Optional<wo> c() {
         return this.d;
      }
   }
}
