import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ww(wx l, wx m) {
   public static final Codec<ww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wx.a.fieldOf("chat").forGetter(ww::a), wx.a.fieldOf("narration").forGetter(ww::b)).apply($$0, ww::new)
   );
   public static final yy<wl, ww> b = yy.a(wx.b, ww::a, wx.b, ww::b, ww::new);
   public static final yy<wl, jf<ww>> c = yw.a(mh.aI, b);
   public static final wx d = wx.a("chat.type.text");
   public static final alh<ww> e = a("chat");
   public static final alh<ww> f = a("say_command");
   public static final alh<ww> g = a("msg_command_incoming");
   public static final alh<ww> h = a("msg_command_outgoing");
   public static final alh<ww> i = a("team_msg_command_incoming");
   public static final alh<ww> j = a("team_msg_command_outgoing");
   public static final alh<ww> k = a("emote_command");

   private static alh<ww> a(String $$0) {
      return alh.a(mh.aI, ali.b($$0));
   }

   public static void a(qh<ww> $$0) {
      $$0.a(e, new ww(d, wx.a("chat.type.text.narrate")));
      $$0.a(f, new ww(wx.a("chat.type.announcement"), wx.a("chat.type.text.narrate")));
      $$0.a(g, new ww(wx.b("commands.message.display.incoming"), wx.a("chat.type.text.narrate")));
      $$0.a(h, new ww(wx.c("commands.message.display.outgoing"), wx.a("chat.type.text.narrate")));
      $$0.a(i, new ww(wx.d("chat.type.team.text"), wx.a("chat.type.text.narrate")));
      $$0.a(j, new ww(wx.d("chat.type.team.sent"), wx.a("chat.type.text.narrate")));
      $$0.a(k, new ww(wx.a("chat.type.emote"), wx.a("chat.type.emote")));
   }

   public static ww.a a(alh<ww> $$0, bwt $$1) {
      return a($$0, $$1.dV().J_(), $$1.m_());
   }

   public static ww.a a(alh<ww> $$0, ej $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static ww.a a(alh<ww> $$0, jt $$1, xa $$2) {
      js<ww> $$3 = $$1.f(mh.aI);
      return new ww.a($$3.b($$0), $$2);
   }

   public wx a() {
      return this.l;
   }

   public wx b() {
      return this.m;
   }

   public static record a(jf<ww> b, xa c, Optional<xa> d) {
      public static final yy<wl, ww.a> a = yy.a(ww.c, ww.a::a, xc.d, ww.a::b, xc.e, ww.a::c, ww.a::new);

      a(jf<ww> $$0, xa $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xa a(xa $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xa b(xa $$0) {
         return this.b.a().b().a($$0, this);
      }

      public ww.a c(xa $$0) {
         return new ww.a(this.b, this.c, Optional.of($$0));
      }

      public jf<ww> a() {
         return this.b;
      }

      public xa b() {
         return this.c;
      }

      public Optional<xa> c() {
         return this.d;
      }
   }
}
