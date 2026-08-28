import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wr(ws l, ws m) {
   public static final Codec<wr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ws.a.fieldOf("chat").forGetter(wr::a), ws.a.fieldOf("narration").forGetter(wr::b)).apply($$0, wr::new)
   );
   public static final yt<wg, wr> b = yt.a(ws.b, wr::a, ws.b, wr::b, wr::new);
   public static final yt<wg, js<wr>> c = yr.a(me.aN, b);
   public static final ws d = ws.a("chat.type.text");
   public static final alc<wr> e = a("chat");
   public static final alc<wr> f = a("say_command");
   public static final alc<wr> g = a("msg_command_incoming");
   public static final alc<wr> h = a("msg_command_outgoing");
   public static final alc<wr> i = a("team_msg_command_incoming");
   public static final alc<wr> j = a("team_msg_command_outgoing");
   public static final alc<wr> k = a("emote_command");

   private static alc<wr> a(String $$0) {
      return alc.a(me.aN, ald.b($$0));
   }

   public static void a(qg<wr> $$0) {
      $$0.a(e, new wr(d, ws.a("chat.type.text.narrate")));
      $$0.a(f, new wr(ws.a("chat.type.announcement"), ws.a("chat.type.text.narrate")));
      $$0.a(g, new wr(ws.b("commands.message.display.incoming"), ws.a("chat.type.text.narrate")));
      $$0.a(h, new wr(ws.c("commands.message.display.outgoing"), ws.a("chat.type.text.narrate")));
      $$0.a(i, new wr(ws.d("chat.type.team.text"), ws.a("chat.type.text.narrate")));
      $$0.a(j, new wr(ws.d("chat.type.team.sent"), ws.a("chat.type.text.narrate")));
      $$0.a(k, new wr(ws.a("chat.type.emote"), ws.a("chat.type.emote")));
   }

   public static wr.a a(alc<wr> $$0, bvs $$1) {
      return a($$0, $$1.dV().F_(), $$1.m_());
   }

   public static wr.a a(alc<wr> $$0, ex $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static wr.a a(alc<wr> $$0, kg $$1, wv $$2) {
      kf<wr> $$3 = $$1.f(me.aN);
      return new wr.a($$3.b($$0), $$2);
   }

   public ws a() {
      return this.l;
   }

   public ws b() {
      return this.m;
   }

   public static record a(js<wr> b, wv c, Optional<wv> d) {
      public static final yt<wg, wr.a> a = yt.a(wr.c, wr.a::a, wx.d, wr.a::b, wx.e, wr.a::c, wr.a::new);

      a(js<wr> $$0, wv $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wv a(wv $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wv b(wv $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wr.a c(wv $$0) {
         return new wr.a(this.b, this.c, Optional.of($$0));
      }

      public js<wr> a() {
         return this.b;
      }

      public wv b() {
         return this.c;
      }

      public Optional<wv> c() {
         return this.d;
      }
   }
}
