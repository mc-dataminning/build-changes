import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xa(xb j, xb k) {
   public static final Codec<xa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xb.a.fieldOf("chat").forGetter(xa::a), xb.a.fieldOf("narration").forGetter(xa::b)).apply($$0, xa::new)
   );
   public static final xb b = xb.a("chat.type.text");
   public static final aks<xa> c = a("chat");
   public static final aks<xa> d = a("say_command");
   public static final aks<xa> e = a("msg_command_incoming");
   public static final aks<xa> f = a("msg_command_outgoing");
   public static final aks<xa> g = a("team_msg_command_incoming");
   public static final aks<xa> h = a("team_msg_command_outgoing");
   public static final aks<xa> i = a("emote_command");

   private static aks<xa> a(String $$0) {
      return aks.a(li.aA, new akt($$0));
   }

   public static void a(qq<xa> $$0) {
      $$0.a(c, new xa(b, xb.a("chat.type.text.narrate")));
      $$0.a(d, new xa(xb.a("chat.type.announcement"), xb.a("chat.type.text.narrate")));
      $$0.a(e, new xa(xb.b("commands.message.display.incoming"), xb.a("chat.type.text.narrate")));
      $$0.a(f, new xa(xb.c("commands.message.display.outgoing"), xb.a("chat.type.text.narrate")));
      $$0.a(g, new xa(xb.d("chat.type.team.text"), xb.a("chat.type.text.narrate")));
      $$0.a(h, new xa(xb.d("chat.type.team.sent"), xb.a("chat.type.text.narrate")));
      $$0.a(i, new xa(xb.a("chat.type.emote"), xb.a("chat.type.emote")));
   }

   public static xa.a a(aks<xa> $$0, brv $$1) {
      return a($$0, $$1.dU().I_(), $$1.P_());
   }

   public static xa.a a(aks<xa> $$0, eh $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xa.a a(aks<xa> $$0, jo $$1, xe $$2) {
      jn<xa> $$3 = $$1.d(li.aA);
      return new xa.a($$3.g($$0), $$2);
   }

   public xb a() {
      return this.j;
   }

   public xb b() {
      return this.k;
   }

   public static record a(ja<xa> b, xe c, Optional<xe> d) {
      public static final zc<wp, xa.a> a = zc.a(za.b(li.aA), xa.a::a, xg.d, xa.a::b, xg.e, xa.a::c, xa.a::new);

      a(ja<xa> $$0, xe $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xe a(xe $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xe b(xe $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xa.a c(xe $$0) {
         return new xa.a(this.b, this.c, Optional.of($$0));
      }

      public ja<xa> a() {
         return this.b;
      }

      public xe b() {
         return this.c;
      }

      public Optional<xe> c() {
         return this.d;
      }
   }
}
