import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wy(wz l, wz m) {
   public static final Codec<wy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wz.a.fieldOf("chat").forGetter(wy::a), wz.a.fieldOf("narration").forGetter(wy::b)).apply($$0, wy::new)
   );
   public static final za<wn, wy> b = za.a(wz.b, wy::a, wz.b, wy::b, wy::new);
   public static final za<wn, jg<wy>> c = yy.a(mi.aI, b);
   public static final wz d = wz.a("chat.type.text");
   public static final alj<wy> e = a("chat");
   public static final alj<wy> f = a("say_command");
   public static final alj<wy> g = a("msg_command_incoming");
   public static final alj<wy> h = a("msg_command_outgoing");
   public static final alj<wy> i = a("team_msg_command_incoming");
   public static final alj<wy> j = a("team_msg_command_outgoing");
   public static final alj<wy> k = a("emote_command");

   private static alj<wy> a(String $$0) {
      return alj.a(mi.aI, alk.b($$0));
   }

   public static void a(qi<wy> $$0) {
      $$0.a(e, new wy(d, wz.a("chat.type.text.narrate")));
      $$0.a(f, new wy(wz.a("chat.type.announcement"), wz.a("chat.type.text.narrate")));
      $$0.a(g, new wy(wz.b("commands.message.display.incoming"), wz.a("chat.type.text.narrate")));
      $$0.a(h, new wy(wz.c("commands.message.display.outgoing"), wz.a("chat.type.text.narrate")));
      $$0.a(i, new wy(wz.d("chat.type.team.text"), wz.a("chat.type.text.narrate")));
      $$0.a(j, new wy(wz.d("chat.type.team.sent"), wz.a("chat.type.text.narrate")));
      $$0.a(k, new wy(wz.a("chat.type.emote"), wz.a("chat.type.emote")));
   }

   public static wy.a a(alj<wy> $$0, bwv $$1) {
      return a($$0, $$1.dV().J_(), $$1.m_());
   }

   public static wy.a a(alj<wy> $$0, ek $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static wy.a a(alj<wy> $$0, ju $$1, xc $$2) {
      jt<wy> $$3 = $$1.f(mi.aI);
      return new wy.a($$3.b($$0), $$2);
   }

   public wz a() {
      return this.l;
   }

   public wz b() {
      return this.m;
   }

   public static record a(jg<wy> b, xc c, Optional<xc> d) {
      public static final za<wn, wy.a> a = za.a(wy.c, wy.a::a, xe.d, wy.a::b, xe.e, wy.a::c, wy.a::new);

      a(jg<wy> $$0, xc $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xc a(xc $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xc b(xc $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wy.a c(xc $$0) {
         return new wy.a(this.b, this.c, Optional.of($$0));
      }

      public jg<wy> a() {
         return this.b;
      }

      public xc b() {
         return this.c;
      }

      public Optional<xc> c() {
         return this.d;
      }
   }
}
