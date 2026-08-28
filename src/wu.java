import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wu(wv l, wv m) {
   public static final Codec<wu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wv.a.fieldOf("chat").forGetter(wu::a), wv.a.fieldOf("narration").forGetter(wu::b)).apply($$0, wu::new)
   );
   public static final yw<wj, wu> b = yw.a(wv.b, wu::a, wv.b, wu::b, wu::new);
   public static final yw<wj, jm<wu>> c = yu.a(lu.aG, b);
   public static final wv d = wv.a("chat.type.text");
   public static final akp<wu> e = a("chat");
   public static final akp<wu> f = a("say_command");
   public static final akp<wu> g = a("msg_command_incoming");
   public static final akp<wu> h = a("msg_command_outgoing");
   public static final akp<wu> i = a("team_msg_command_incoming");
   public static final akp<wu> j = a("team_msg_command_outgoing");
   public static final akp<wu> k = a("emote_command");

   private static akp<wu> a(String $$0) {
      return akp.a(lu.aG, akq.b($$0));
   }

   public static void a(qp<wu> $$0) {
      $$0.a(e, new wu(d, wv.a("chat.type.text.narrate")));
      $$0.a(f, new wu(wv.a("chat.type.announcement"), wv.a("chat.type.text.narrate")));
      $$0.a(g, new wu(wv.b("commands.message.display.incoming"), wv.a("chat.type.text.narrate")));
      $$0.a(h, new wu(wv.c("commands.message.display.outgoing"), wv.a("chat.type.text.narrate")));
      $$0.a(i, new wu(wv.d("chat.type.team.text"), wv.a("chat.type.text.narrate")));
      $$0.a(j, new wu(wv.d("chat.type.team.sent"), wv.a("chat.type.text.narrate")));
      $$0.a(k, new wu(wv.a("chat.type.emote"), wv.a("chat.type.emote")));
   }

   public static wu.a a(akp<wu> $$0, bsq $$1) {
      return a($$0, $$1.dQ().H_(), $$1.O_());
   }

   public static wu.a a(akp<wu> $$0, et $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wu.a a(akp<wu> $$0, ka $$1, wy $$2) {
      jz<wu> $$3 = $$1.d(lu.aG);
      return new wu.a($$3.g($$0), $$2);
   }

   public wv a() {
      return this.l;
   }

   public wv b() {
      return this.m;
   }

   public static record a(jm<wu> b, wy c, Optional<wy> d) {
      public static final yw<wj, wu.a> a = yw.a(wu.c, wu.a::a, xa.d, wu.a::b, xa.e, wu.a::c, wu.a::new);

      a(jm<wu> $$0, wy $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wy a(wy $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wy b(wy $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wu.a c(wy $$0) {
         return new wu.a(this.b, this.c, Optional.of($$0));
      }

      public jm<wu> a() {
         return this.b;
      }

      public wy b() {
         return this.c;
      }

      public Optional<wy> c() {
         return this.d;
      }
   }
}
