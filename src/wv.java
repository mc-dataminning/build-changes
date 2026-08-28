import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wv(ww l, ww m) {
   public static final Codec<wv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ww.a.fieldOf("chat").forGetter(wv::a), ww.a.fieldOf("narration").forGetter(wv::b)).apply($$0, wv::new)
   );
   public static final yx<wk, wv> b = yx.a(ww.b, wv::a, ww.b, wv::b, wv::new);
   public static final yx<wk, jm<wv>> c = yv.a(lu.aG, b);
   public static final ww d = ww.a("chat.type.text");
   public static final akq<wv> e = a("chat");
   public static final akq<wv> f = a("say_command");
   public static final akq<wv> g = a("msg_command_incoming");
   public static final akq<wv> h = a("msg_command_outgoing");
   public static final akq<wv> i = a("team_msg_command_incoming");
   public static final akq<wv> j = a("team_msg_command_outgoing");
   public static final akq<wv> k = a("emote_command");

   private static akq<wv> a(String $$0) {
      return akq.a(lu.aG, akr.b($$0));
   }

   public static void a(qq<wv> $$0) {
      $$0.a(e, new wv(d, ww.a("chat.type.text.narrate")));
      $$0.a(f, new wv(ww.a("chat.type.announcement"), ww.a("chat.type.text.narrate")));
      $$0.a(g, new wv(ww.b("commands.message.display.incoming"), ww.a("chat.type.text.narrate")));
      $$0.a(h, new wv(ww.c("commands.message.display.outgoing"), ww.a("chat.type.text.narrate")));
      $$0.a(i, new wv(ww.d("chat.type.team.text"), ww.a("chat.type.text.narrate")));
      $$0.a(j, new wv(ww.d("chat.type.team.sent"), ww.a("chat.type.text.narrate")));
      $$0.a(k, new wv(ww.a("chat.type.emote"), ww.a("chat.type.emote")));
   }

   public static wv.a a(akq<wv> $$0, bsr $$1) {
      return a($$0, $$1.dP().H_(), $$1.S_());
   }

   public static wv.a a(akq<wv> $$0, et $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wv.a a(akq<wv> $$0, ka $$1, wz $$2) {
      jz<wv> $$3 = $$1.d(lu.aG);
      return new wv.a($$3.g($$0), $$2);
   }

   public ww a() {
      return this.l;
   }

   public ww b() {
      return this.m;
   }

   public static record a(jm<wv> b, wz c, Optional<wz> d) {
      public static final yx<wk, wv.a> a = yx.a(wv.c, wv.a::a, xb.d, wv.a::b, xb.e, wv.a::c, wv.a::new);

      a(jm<wv> $$0, wz $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wz a(wz $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wz b(wz $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wv.a c(wz $$0) {
         return new wv.a(this.b, this.c, Optional.of($$0));
      }

      public jm<wv> a() {
         return this.b;
      }

      public wz b() {
         return this.c;
      }

      public Optional<wz> c() {
         return this.d;
      }
   }
}
