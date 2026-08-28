import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wl(wm l, wm m) {
   public static final Codec<wl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wm.a.fieldOf("chat").forGetter(wl::a), wm.a.fieldOf("narration").forGetter(wl::b)).apply($$0, wl::new)
   );
   public static final yn<wa, wl> b = yn.a(wm.b, wl::a, wm.b, wl::b, wl::new);
   public static final yn<wa, jr<wl>> c = yl.a(mc.aJ, b);
   public static final wm d = wm.a("chat.type.text");
   public static final aku<wl> e = a("chat");
   public static final aku<wl> f = a("say_command");
   public static final aku<wl> g = a("msg_command_incoming");
   public static final aku<wl> h = a("msg_command_outgoing");
   public static final aku<wl> i = a("team_msg_command_incoming");
   public static final aku<wl> j = a("team_msg_command_outgoing");
   public static final aku<wl> k = a("emote_command");

   private static aku<wl> a(String $$0) {
      return aku.a(mc.aJ, akv.b($$0));
   }

   public static void a(qe<wl> $$0) {
      $$0.a(e, new wl(d, wm.a("chat.type.text.narrate")));
      $$0.a(f, new wl(wm.a("chat.type.announcement"), wm.a("chat.type.text.narrate")));
      $$0.a(g, new wl(wm.b("commands.message.display.incoming"), wm.a("chat.type.text.narrate")));
      $$0.a(h, new wl(wm.c("commands.message.display.outgoing"), wm.a("chat.type.text.narrate")));
      $$0.a(i, new wl(wm.d("chat.type.team.text"), wm.a("chat.type.text.narrate")));
      $$0.a(j, new wl(wm.d("chat.type.team.sent"), wm.a("chat.type.text.narrate")));
      $$0.a(k, new wl(wm.a("chat.type.emote"), wm.a("chat.type.emote")));
   }

   public static wl.a a(aku<wl> $$0, bum $$1) {
      return a($$0, $$1.dV().K_(), $$1.p_());
   }

   public static wl.a a(aku<wl> $$0, ex $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static wl.a a(aku<wl> $$0, kf $$1, wp $$2) {
      ke<wl> $$3 = $$1.e(mc.aJ);
      return new wl.a($$3.b($$0), $$2);
   }

   public wm a() {
      return this.l;
   }

   public wm b() {
      return this.m;
   }

   public static record a(jr<wl> b, wp c, Optional<wp> d) {
      public static final yn<wa, wl.a> a = yn.a(wl.c, wl.a::a, wr.d, wl.a::b, wr.e, wl.a::c, wl.a::new);

      a(jr<wl> $$0, wp $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wp a(wp $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wp b(wp $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wl.a c(wp $$0) {
         return new wl.a(this.b, this.c, Optional.of($$0));
      }

      public jr<wl> a() {
         return this.b;
      }

      public wp b() {
         return this.c;
      }

      public Optional<wp> c() {
         return this.d;
      }
   }
}
