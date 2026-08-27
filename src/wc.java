import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wc(wd j, wd k) {
   public static final Codec<wc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wd.a.fieldOf("chat").forGetter(wc::a), wd.a.fieldOf("narration").forGetter(wc::b)).apply($$0, wc::new)
   );
   public static final wd b = wd.a("chat.type.text");
   public static final ajs<wc> c = a("chat");
   public static final ajs<wc> d = a("say_command");
   public static final ajs<wc> e = a("msg_command_incoming");
   public static final ajs<wc> f = a("msg_command_outgoing");
   public static final ajs<wc> g = a("team_msg_command_incoming");
   public static final ajs<wc> h = a("team_msg_command_outgoing");
   public static final ajs<wc> i = a("emote_command");

   private static ajs<wc> a(String $$0) {
      return ajs.a(ks.aw, new ajt($$0));
   }

   public static void a(px<wc> $$0) {
      $$0.a(c, new wc(b, wd.a("chat.type.text.narrate")));
      $$0.a(d, new wc(wd.a("chat.type.announcement"), wd.a("chat.type.text.narrate")));
      $$0.a(e, new wc(wd.b("commands.message.display.incoming"), wd.a("chat.type.text.narrate")));
      $$0.a(f, new wc(wd.c("commands.message.display.outgoing"), wd.a("chat.type.text.narrate")));
      $$0.a(g, new wc(wd.d("chat.type.team.text"), wd.a("chat.type.text.narrate")));
      $$0.a(h, new wc(wd.d("chat.type.team.sent"), wd.a("chat.type.text.narrate")));
      $$0.a(i, new wc(wd.a("chat.type.emote"), wd.a("chat.type.emote")));
   }

   public static wc.a a(ajs<wc> $$0, bpv $$1) {
      return a($$0, $$1.dM().H_(), $$1.O_());
   }

   public static wc.a a(ajs<wc> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wc.a a(ajs<wc> $$0, iz $$1, wg $$2) {
      iy<wc> $$3 = $$1.d(ks.aw);
      return new wc.a($$3.g($$0), $$2);
   }

   public wd a() {
      return this.j;
   }

   public wd b() {
      return this.k;
   }

   public static record a(il<wc> b, wg c, Optional<wg> d) {
      public static final ye<vr, wc.a> a = ye.a(yc.b(ks.aw), wc.a::a, wi.d, wc.a::b, wi.e, wc.a::c, wc.a::new);

      a(il<wc> $$0, wg $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wg a(wg $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wg b(wg $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wc.a c(wg $$0) {
         return new wc.a(this.b, this.c, Optional.of($$0));
      }

      public il<wc> a() {
         return this.b;
      }

      public wg b() {
         return this.c;
      }

      public Optional<wg> c() {
         return this.d;
      }
   }
}
